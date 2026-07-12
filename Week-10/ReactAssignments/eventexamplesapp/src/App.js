import './App.css';
import CurrencyConvertor from './Components/CurrencyConvertor';
function App() {
    let count = 0;
    const increment = () => {
        count++;
        alert("Counter : " + count);
    };
    const decrement = () => {
        count--;
        alert("Counter : " + count);
    };
    const sayHello = () => {
        alert("Hello! Member1");
    };
    const increase = () => {
        increment();
        sayHello();
    };
    const sayWelcome = (message) => {
        alert(message);
    };
    const handleClick = () => {
        alert("I was clicked");
    };
    return (
        <div style={{ padding: "20px" }}>
            <button onClick={increase}>
                Increment
            </button>
            <br /><br />
            <button onClick={decrement}>
                Decrement
            </button>
            <br /><br />
            <button onClick={() => sayWelcome("Welcome")}>
                Say Welcome
            </button>
            <br /><br />
            <button onClick={handleClick}>
                Click on me
            </button>
            <hr />
            <CurrencyConvertor />
        </div>
    );
}
export default App;