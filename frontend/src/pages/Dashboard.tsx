import { useEffect, useState } from "react";
import { getHelloStr } from "../features/dashboard/api";

export default function Dashboard() {

    const [sayHello, setSayHello] = useState<string>("")

    useEffect(() => {
        const fetchData = async () => {
            try {
                setSayHello(await getHelloStr());
            } catch (err) {
                console.log("Dashboard error: ", err);
            }
        }

        fetchData()
    }, [])

    return <div>
        {sayHello}
    </div>

}