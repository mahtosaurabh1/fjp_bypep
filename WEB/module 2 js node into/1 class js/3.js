 let users = [ { name: "Rajneesh", age: 34, address: { local: "22 Alaknanda", city: "Dehradun", state: "UK", }, orders: [{ id: 1, name: "GOT Book Series" }], }, { name: "Bhavesh", age: 37, address: { local: "48 DT Row", city: "Hyderabad", state: "AP", }, }, { name: "Jasbir", age: 38, address: { local: "196 Lama Bhavan", city: "Gangtok", state: "Sikkim", }, orders: [ { id: 1, name: "Chair" }, { id: 2, name: "PS5" }, ], }, ];
for(let i=0;i<users.length;i++){
    users[i].address.state="uk"
    users[i].address.city="DEHARADUN"
    users[i].address.local="25 iroda"
    console.log(users[i])
}