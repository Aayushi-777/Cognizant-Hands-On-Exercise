import React from "react";
export function OddPlayers([first, third, fifth]) {
    return (
        <div>
            <h3>Odd Team Players</h3>
            <ul>
                <li>First : {first}</li>
                <li>Third : {third}</li>
                <li>Fifth : {fifth}</li>
            </ul>
        </div>
    );
}
export function EvenPlayers([second, fourth, sixth]) {
    return (
        <div>
            <h3>Even Team Players</h3>
            <ul>
                <li>Second : {second}</li>
                <li>Fourth : {fourth}</li>
                <li>Sixth : {sixth}</li>
            </ul>
        </div>
    );
}
function IndianPlayers() {
    const T20Players = [
        "Virat Kohli",
        "Rohit Sharma",
        "Hardik Pandya"
    ];
    const RanjiPlayers = [
        "Mayank Agarwal",
        "Sarfaraz Khan",
        "Hanuma Vihari"
    ];
    const mergedPlayers = [...T20Players, ...RanjiPlayers];
    return (
        <div>
            {OddPlayers(["Virat", "Hardik", "Jadeja"])}
            {EvenPlayers(["Rohit", "Gill", "Ashwin"])}
            <h3>Merged Players</h3>
            <ul>
                {
                    mergedPlayers.map((player, index) => (
                        <li key={index}>{player}</li>
                    ))
                }
            </ul>
        </div>
    );
}
export default IndianPlayers;