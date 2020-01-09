const users = Vue.resource('/users/{id}');

export default {
    getByUserId: userId => users.getByUserId({id}),
    add: user => users.save({}, user),
    update: update => users.update({id: users.id}, users),
    remove: id => users.remove({id}),
}