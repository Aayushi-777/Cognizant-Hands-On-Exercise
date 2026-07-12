import React, { Component } from "react";
class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            amount: "",
            currency: "Euro"
        };
    }
    changeAmount = (event) => {
        this.setState({
            amount: event.target.value
        });
    };
    changeCurrency = (event) => {
        this.setState({
            currency: event.target.value
        });
    };
    handleSubmit = (event) => {
        event.preventDefault();
        const convertedAmount = this.state.amount * 80;
        alert(
            "Converting to " +
            this.state.currency +
            " Amount is " +
            convertedAmount
        );
    };
    render() {
        return (
            <div>
                <h1 style={{color:"green"}}>
                    Currency Convertor!!!
                </h1>
                <form onSubmit={this.handleSubmit}>
                    <table>
                        <tbody>
                            <tr>
                                <td>Amount:</td>
                                <td>
                                    <input
                                        type="number"
                                        value={this.state.amount}
                                        onChange={this.changeAmount}
                                    />
                                </td>
                            </tr>
                            <tr>
                                <td>Currency:</td>
                                <td>
                                    <input
                                        type="text"
                                        value={this.state.currency}
                                        onChange={this.changeCurrency}
                                    />
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <button type="submit">
                                        Submit
                                    </button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        );
    }
}
export default CurrencyConvertor;