import React from "react";
function ListofPlayers() {
    const players = [
        { id: 1, name: "Virat Kohli", score: 95 },
        { id: 2, name: "Rohit Sharma", score: 68 },
        { id: 3, name: "KL Rahul", score: 75 },
        { id: 4, name: "Shubman Gill", score: 85 },
        { id: 5, name: "Hardik Pandya", score: 62 },
        { id: 6, name: "Ravindra Jadeja", score: 71 },
        { id: 7, name: "R Ashwin", score: 55 },
        { id: 8, name: "Mohammed Shami", score: 49 },
        { id: 9, name: "Jasprit Bumrah", score: 80 },
        { id: 10, name: "Ishan Kishan", score: 67 },
        { id: 11, name: "Suryakumar Yadav", score: 92 }
    ];
    const players70 = players.filter(player => player.score <= 70);
    return (
        <div>
            <h2>List of Players</h2>
            <ul>
                {
                    players.map(player => (
                        <li key={player.id}>
                            Mr. {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>
            <h2>Players with Score Below or Equal to 70</h2>
            <ul>
                {
                    players70.map(player => (
                        <li key={player.id}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>

        </div>
    );
}
export default ListofPlayers;