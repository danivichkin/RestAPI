const wishlist = Vue.resource('/wishLists/{id}');

export default {
    getById: wishlistId => wishlist.get({id}),
    update: user => wishlist.put({}, user),
    remove: id => wishlist.delete({id}),
}