import {createInstance} from "./index.js";

const instance = createInstance();
function login(userId, password, success, fail) {
    instance.get("users/login?userId="+userId+"&password="+password )
            .then(success)
            .catch(fail);
}

function signup(userId, email, password, name, success, fail) {
    const user = {
        email:email,
        userId:userId,
        password:password,
        name:name
    }
    
    instance.post("users/join", JSON.stringify(user))
            .then(success)
            .catch(fail);
}

export {signup, login};