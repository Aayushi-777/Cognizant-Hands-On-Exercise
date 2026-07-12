function Guest() {
    return (
        <div>
            <h2>Flight Details</h2>
            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Time</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>AI202</td>
                        <td>Delhi</td>
                        <td>Mumbai</td>
                        <td>10:30 AM</td>
                    </tr>
                    <tr>
                        <td>6E315</td>
                        <td>Bangalore</td>
                        <td>Hyderabad</td>
                        <td>2:00 PM</td>
                    </tr>
                </tbody>
            </table>
            <h3>Please login to book tickets.</h3>
        </div>
    );
}
export default Guest;