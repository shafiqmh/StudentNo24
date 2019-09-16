
function calculate(operator) {

	// let args = Array.prototype.slice(arguments);

	// let addy = (num1 , num2) => num1 + num2;

	// let subtracty = (num1 , num2) => num1 - num2;
	// let multiply = (num1 , num2) => num1 * num2;
	// let dividy = (num1 , num2) => num1 / num2;

	const mult = () => {
		let val = 1;
		for (let i = 1; i < arguments.length; i++) {
			val *= arguments[i];
		}
		return val;
	}

	const div = () => {
		let val = arguments[1];
		for (let i = 2; i < arguments.length; i++) {
			val /= arguments[i]
		}
		return val;
	}

	const add = () => {
		let val = 0;
		for (i = 1; i < arguments.length; i++) {
			val += arguments[i];
		}
		return val;
	}

	const sub = () => {
		let val = arguments[1];
		for (let i = 2; i < arguments.length; i++) {
			val -= arguments[i]
		}
		return val;
	}

	console.log(arguments)
	// let sum = 0;

	if (operator == '*') {
		return mult();
	}
	if (operator == '/') {
		return div();
	}
	if (operator == '+') {
		return add();
	}
	if (operator == '-') {
		return sub();
	}



	// if (arguments[0] == '+') {
	// 	for (var i=1; i<arguments.length; i++) {
	// 		ans += arguments[i];
	// 	}
	// }
	// else if (arguments[0] == '-') {
	// 	for (var i=1; i<arguments.length; i++) {
	// 		ans -= arguments[i];
	// 	}
	// }
	// else if (arguments[0] == '*') {
	// 	for (var i=1; i<arguments.length; i++) {
	// 		ans *= arguments[i];
	// 	}
	// }
	// else if (arguments[0] == '/') {
	// 	for (var i=1; i<arguments.length; i++) {
	// 		ans /= arguments[i]
	// 	}
	// }
	// return sum;
}



// const myArray = [
// 	'frog', 'llama', 'elephant', 'crocodile', 'hippopotamus', 'aardvark', 'geoff', 'galapagos giant tortoise'
// ];

// myArray.forEach((value) => {
// 	console.log(value);
// });

// const result = 'Animals: ' + myArray.filter((value, index) => {
// 	if (value.length < 9) {
// 		return true;
// 	} else {
// 		return false;
// 	}
// }).map((value, index, array) => {
// 	if (index < array.length - 1) {
// 		return value[0].toUpperCase() + value.substring(1) + ', ';
// 	} else {
// 		return value[0].toUpperCase() + value.substring(1) + '.';
// 	}
// }).reduce((prev, current) => {
// 	return prev + current;
// })





function handleClick(element) {
	//alert('Clicked!!');
		element.innerText = 'off';
		element.style.backgroundColor = 'green';


	document.getElementById('mystuff').innerText = 'You SPAZ';

	const containerEl = document.getElementById('mystuff');
	const newEl = document.createElement('p');
	newEl.innerText = 'Listen to instructions for once!';
	containerEl.append(newEl);         
	//containerEl.removeChild(newEl)

}

/////////////////////////////////////////////

let counter = 0;

function changeCounter(val) {
	counter = counter + val;
	updateCounter();
}

function resetCounter() {
	counter = 0;
	updateCounter();
}

function updateCounter() {
	document.getElementById('number').innerText = counter;
	if (counter%2 == 0) {
		document.getElementById('number').style.backgroundColor = 'green';
	} else {
		document.getElementById('number').style.backgroundColor = 'red';
	}
	if (counter>100) {
		document.getElementById('number').innerText = counter + '!';
	}
}

///////////////////////////////////////////////

function handleFormSubmit(form) {
	console.log('Input successful: ', form.elements.firstName.value);
	
	const formDataObj = {};

	for(let element of form.elements) {
		console.log(element.value)
		if (element.id != "") {
		formDataObj[element.id] = element.value;
		}
	}

	console.log(formDataObj);

	return false;
}


function handleChange(form) {
	const alert = document.getElementById("blueprompt");
	alert.innerText = "Hi there, " + form.value;
}

// function pulldown(t) {
// 	const details = handleFormSubmit(form);
// 	console.log(details);
// }

// const{forename: firstName, surname: lastName, user: username, pass: password} = formDataObj;
// console.log(firstName);



//merging two arrays
const peep1 = [
	'Shafiq',
	'Martin'
]
const peep2 = [
	'William',
	'Dylan'
]
const merged = [...peep1, ...peep2]
//console.log(merged)


//printing all names except specified ones
function printNames(arg1, ...restOfArgs) {
	console.log(arg1, restOfArgs);
}
//passing a name into a function
function passObj({name}) {
	console.log('my name is ' + name);
}
//passObj({name: 'martin'})
//printNames('Shafiq', 'Martin', 'William', 'Dylan', 'Shaan', 'Chris')



//switching values
let a = 'basketball';
let b = 'spanner';
[a,b] = [b,a];
//b= [a, a=b][0]; not an ideal way of switching values
console.log(a,b);



