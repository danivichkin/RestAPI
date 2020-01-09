
var userApi = Vue.resource('/users{/id}');

Vue.component('user-form', {
    props: ['users'],
    data: function () {
        return {
            name: ''
        }
    },
    template:
        '<div>' +
                '<input type = "name" placeholder = "Write something" v-model="name" />' +
                '<input type = "button" value = "Save" @click="save"/>' +
        '</div>',
    methods: {
        save: function () {
            var user = {name: this.name}
            userApi.save({}, user).then(result =>
                result.json().then(data => {
                    this.users.push(data);
                    this.name = ''
            }))
        }
    }
});

Vue.component('user-id', {
   props: ['user'],
   template: '<div><i>{{user.id}}</i>{{user.name}}</div>'
});

Vue.component('users-list', {
    props: ['users'],
    template: '<div>' +
        '<user-form :users="users" />' +
        '<user-id v-for="user in users" :key="user.id" :user="user" />' +
        '</div>',
    created: function () {
        userApi.get().then(result =>
            result.json().then(data =>
                data.forEach(user => this.users.push(user))))
    }
});

var app = new Vue({
    el: '#app',
    template: '<users-list :users="users" />',
    data:{
        users: []
    },
});