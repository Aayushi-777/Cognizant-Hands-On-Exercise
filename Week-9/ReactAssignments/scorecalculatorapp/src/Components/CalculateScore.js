import "../Stylesheets/mystyle.css";
const percentToDecimal = (decimal) => {
  return decimal.toFixed(2) + "%";
};
const calcScore = (total, goal) => {
  return percentToDecimal((total / goal) * 100);
};
function CalculateScore(props) {
  return (
    <div className="formatstyle">
      <h1 style={{ color: "brown" }}>
        Student Details
      </h1>
      <div className="Name">
        <b>Name :</b> {props.Name}
      </div>
      <div className="School">
        <b>School :</b> {props.School}
      </div>
      <div className="Total">
        <b>Total :</b> {props.total} Marks
      </div>
      <div className="Score">
        <b>Score :</b> {calcScore(props.total, props.goal)}
      </div>
    </div>
  );
}
export default CalculateScore;