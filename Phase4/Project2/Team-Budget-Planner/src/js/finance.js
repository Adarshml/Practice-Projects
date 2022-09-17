const expenses = document.getElementById("expenses");
const total = document.getElementById("total");
const tbody = document.getElementById("tbody");

var teamsExpList = JSON.parse(localStorage.getItem("teamsExpList")); // all teams objects
displayExp(teamsExpList);

function displayExp(teamsExpList) {
  tbody.innerHTML = null;
  for (i = 0; i < teamsExpList.length; i++) {
    tbody.innerHTML += `
        <tr>
        <td>${teamsExpList[i].teamName}</td>
        <td>${teamsExpList[i].projID}</td>
        <td>${teamsExpList[i].teamMembers}</td>
        <td>${teamsExpList[i].mngrID}</td>
        <td>$ ${teamsExpList[i].expensesAmount} </td>
        <td>${teamsExpList[i].expensesDate}</td>
        <td>$ ${teamsExpList[i].expensesAmount} </td>
        </tr>
    `;
  }

  calcAllExpenses(); // calculate total expenses
}

function calcAllExpenses() {
  let totalExp = 0;
  for (var a of teamsExpList) {
    totalExp += Number(a.expensesAmount);
    console.log(totalExp);
  }
  total.innerHTML += `<span style="color: #000000;"> $ ${totalExp}</span>`;
}
// clear local storage of browser
// localStorage.clear();