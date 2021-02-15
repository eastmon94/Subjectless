<template>
    <v-card tile>
        <v-app-bar app hide-on-scroll flat style="background-color:rgb(170,145,251);">
            <v-toolbar-title id="header1">
                <router-link class="navbar-brand font rounded-lg" to="/" id="title">
                    <img src="../assets/logo.png" id="logo"/>
                </router-link>
            </v-toolbar-title>
            <v-toolbar-title id="header2">
                <router-link id="link-to-home" @click="home" to="/" style="color:white;">HOME</router-link>
                <router-link id="link-to-entrance" @click="log" to="/logMenu" style="color:white;">출입기록조회</router-link>
                <router-link id="link-to-board" @click="board" to="/boardMenu" style="color:white;">공지사항</router-link>
                <router-link id="link-to-edit" > </router-link>
            </v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-title id="header2">
                <a id="link-to-login"
                v-if="!$store.state.isSigned"
                    @click.stop="signup = true">로그인</a>
                <span id="login-user" v-if="$store.state.isSigned">{{userName}}님</span>
                <router-link id="link-to-edit" to="/edit" @click.native="edit" v-if="!$store.state.isAdmin && $store.state.isSigned">회원정보수정</router-link>
                <router-link id="link-to-logout" to="/logout" v-if="$store.state.isSigned">로그아웃</router-link>
            </v-toolbar-title>

            <v-dialog v-model="signup" max-width="500" min-width="300">
                <Login></Login>
            </v-dialog>
        </v-app-bar>
    </v-card>
</template>

<script>
export default {

}
</script>

<style>

</style>