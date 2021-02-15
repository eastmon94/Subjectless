<template>
    <v-container>
        <v-card>
            <v-container>
                <v-card-title class="headline">login</v-card-title>

                <v-text-field
                    label="아이디"
                    v-model="user.userId"
                ></v-text-field>
                <v-text-field
                    label="비밀번호"
                    v-model="user.password"
                    type="password"
                ></v-text-field>

                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="green darken-1" text @click="login" min-width="100px">
                        <v-icon>fas fa-sign-in-alt</v-icon>
                        LogIn
                    </v-btn>
                    <!-- <v-btn text @click.stop="signup = true" min-width="100px">
                        <v-icon>person_add</v-icon>
                        Sign Up
                    </v-btn> -->
                    <!-- <v-dialog v-model="signup" max-width="500">
                        <Signup></Signup>
                    </v-dialog> -->
                </v-card-actions>
            </v-container>
        </v-card>
    </v-container>

</template>

<script>
import {login, /*signup*/} from "@/api/user.js";

export default {
    data() {
        return {
            user : {
                userId:"",
                password : ""
            },
            signup:false
        }
    },

    methods: {
        login() {
            console.log(this.user.password);
            login(
                this.user.userId,
                this.user.password,
                (response)=>{
                    if(response.status==200) {
                        this.$store.commit("setUser", this.user.userId);
                    } else {
                        alert("아이디 또는 패스워드를 확인해주세요.");
                    }
                },
                (error)=>{
                    alert(error);
                }
            )
        }
    }
}
</script>

<style>

</style>