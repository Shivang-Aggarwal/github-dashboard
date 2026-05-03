import { api } from "../../lib/axios";

// GET say-hello
export const getHelloStr = async () => {
    const res = await api.get("/dashboard/say-hello");
    return res.data;
}