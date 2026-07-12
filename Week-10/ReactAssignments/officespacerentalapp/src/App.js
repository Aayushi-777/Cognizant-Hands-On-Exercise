import office from "./images/office.jpg";
function App() {
  const officeList = [
    {
      id: 1,
      name: "Sky Tower",
      rent: 45000,
      address: "Bangalore"
    },
    {
      id: 2,
      name: "Tech Park",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      id: 3,
      name: "Business Hub",
      rent: 55000,
      address: "Pune"
    }
  ];
  return(
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>
      <img
        src={office}
        alt="Office"
        width="500"
      />
      <hr />
      {
        officeList.map((office) => (
          <div
            key={office.id}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "20px"
            }}
          >
            <h2>{office.name}</h2>
            <h3
              style={{
                color:
                  office.rent < 60000
                    ? "red"
                    : "green"
              }}
            >
              Rent : ₹{office.rent}
            </h3>
            <h4>Address : {office.address}</h4>
          </div>
        ))
      }
    </div>
  );
}
export default App;