import axios from "axios";


//http://localhost:8080/users/

const api = axios.create({
    baseURL: "http://localhost:8080/users/"
});

export default api;