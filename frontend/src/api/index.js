import axios from "axios";
import {API_BASE_URL} from "@/config/index.js";

function createInstance() {
    const instance = axios.create({
        baseURL : API_BASE_URL,
        headers: {
            "Content-type":"application/json"
        }
    });

    return instance;
}

export {createInstance};