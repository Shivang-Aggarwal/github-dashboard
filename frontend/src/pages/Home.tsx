import { Search } from "lucide-react";
import { useState } from "react";
import logo from "../assets/github_logo.png";

export default function Home() {

    const [userName, setUserName] = useState<string>("");

    return (
        <div className="flex items-center justify-center h-screen bg-gray-600">
            <img src={logo} className="w-18 h-auto" alt="logo" />
            <input 
                value={userName} 
                onChange={(e) => setUserName(e.target.value)}
                className="ml-3 px-4 py-2 bg-white border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500"
            />
            <button
                className="p-2 ml-2 bg-gray-500 rounded-full hover:bg-gray-300"
            >
                <Search className="w-7 h-7 text-gray-800" />
            </button>
        </div>
    )

}