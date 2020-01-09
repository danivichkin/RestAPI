const direct = Vue.resource('/direction/{id}');

export default {
    getDirectionById: directId => direct.get({id}),
    add: direct => direct.post({id}),
    save: direction => direct.put({}, direction),
    delete: id => direct.delete({id}),
}