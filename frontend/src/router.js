
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetPetManager from "./components/listers/PetPetCards"
import PetPetDetail from "./components/listers/PetPetDetail"
import PetPetManager from "./components/listers/PetPetCards"
import PetPetDetail from "./components/listers/PetPetDetail"

import FeedFeedManager from "./components/listers/FeedFeedCards"
import FeedFeedDetail from "./components/listers/FeedFeedDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/pets/pets',
                name: 'PetPetManager',
                component: PetPetManager
            },
            {
                path: '/pets/pets/:id',
                name: 'PetPetDetail',
                component: PetPetDetail
            },
            {
                path: '/pets/pets',
                name: 'PetPetManager',
                component: PetPetManager
            },
            {
                path: '/pets/pets/:id',
                name: 'PetPetDetail',
                component: PetPetDetail
            },

            {
                path: '/feeds/feeds',
                name: 'FeedFeedManager',
                component: FeedFeedManager
            },
            {
                path: '/feeds/feeds/:id',
                name: 'FeedFeedDetail',
                component: FeedFeedDetail
            },



    ]
})
