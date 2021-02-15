import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    isSigned:false,
    userId:null
  },
  mutations: {
    setIsSigned(state, isSigned) {
      state.isSigned = isSigned;
    },
    setUser(state, userId) {
      state.userId=userId;
    },
    logout(state) {
      state.isSigned=false;
      state.userId=null;
    }
  },
  actions: {
  },
  modules: {
  }
})
