import { useState } from "react";
import Guest from "./Components/Guest";
import User from "./Components/User";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";
function App() {
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    return (
        <div style={{ padding: "30px" }}>
            {
                isLoggedIn
                    ? <User />
                    : <Guest />
            }
            <br />
            {
                isLoggedIn
                    ?
                    <LogoutButton
                        onClick={() => setIsLoggedIn(false)}
                    />
                    :
                    <LoginButton
                        onClick={() => setIsLoggedIn(true)}
                    />
            }
        </div>
    );
}
export default App;