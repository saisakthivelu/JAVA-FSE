// main.js — Local Community Event Portal (Aligned with JavaScript Module)

/*  Module 1: JavaScript Basics*/
console.log("Welcome to the Community Portal");

window.addEventListener('load', function () {
    alert("Community Event Portal loaded successfully!");
    loadSavedPreferences();
});

/* Module 2: Data Types & Operators*/
const eventName = "Community Music Festival";
const eventDate = "2024-06-15";
let availableSeats = 150;

/* Module 5: Object & Prototypes*/
function Event(name, date, category, seats, fee) {
    this.name = name;
    this.date = new Date(date);
    this.category = category;
    this.seats = seats;
    this.fee = fee;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0 && this.date > new Date();
};

Event.prototype.register = function () {
    if (this.checkAvailability()) {
        this.seats--;
        return true;
    }
    return false;
};

/*  Module 6: Arrays & Methods*/
let communityEvents = [
    new Event("Music Festival", "2024-06-15", "music", 150, 25),
    new Event("Art Workshop", "2024-06-20", "workshop", 30, 15),
    new Event("Tech Seminar", "2024-07-01", "seminar", 100, 20),
    new Event("Food Fair", "2024-07-10", "festival", 200, 10),
    new Event("Sports Tournament", "2024-07-15", "sports", 50, 30)
];

/* Module 4: Closures & Higher-Order Functions*/
const createRegistrationTracker = (category) => {
    let totalRegistrations = 0;
    return {
        addRegistration: () => ++totalRegistrations,
        getTotal: () => totalRegistrations,
        getCategory: () => category
    };
};
const workshopTracker = createRegistrationTracker("workshop");
const seminarTracker = createRegistrationTracker("seminar");

/*  Module 3: Conditionals & Loops*/
function displayEvents() {
    const container = document.getElementById("eventsContainer");
    if (!container) return;

    container.innerHTML = "";
    communityEvents.forEach(event => {
        if (event.checkAvailability()) {
            const div = document.createElement("div");
            div.className = "col-md-4 mb-3";
            div.innerHTML = `
                <div class="card eventCard">
                    <div class="card-body">
                        <h5 class="card-title">${event.name}</h5>
                        <p class="card-text">Date: ${event.date.toDateString()}</p>
                        <p class="card-text">Category: ${event.category}</p>
                        <p class="card-text">Available Seats: ${event.seats}</p>
                        <p class="card-text">Fee: $${event.fee}</p>
                        <button class="btn btn-primary" onclick="quickRegister('${event.name}')">Register Now</button>
                    </div>
                </div>
            `;
            container.appendChild(div);
        }
    });
}

/*Module 8: Event Handling*/
function quickRegister(eventName) {
    const user = prompt("Enter your name:");
    if (user && registerUser(eventName, user)) {
        alert(`Successfully registered ${user} for ${eventName}`);
        displayEvents();
    } else {
        alert("Registration failed.");
    }
}

/*  Module 11: Forms*/
function submitForm(e) {
    e.preventDefault();
    const form = e.target;
    const data = new FormData(form);
    const { userName, userEmail, eventType } = Object.fromEntries(data);

    if (!userName || !userEmail || !eventType) {
        alert("Please fill all required fields.");
        return false;
    }

    submitRegistration({ userName, userEmail, eventType });
}

/* Module 9 & 12: Async + Fetch */
async function submitRegistration(userData) {
    const loader = showLoadingSpinner();
    try {
        const result = await simulateAPICall(userData);
        if (result.success) {
            alert("Registration submitted successfully!");
            document.getElementById("registrationForm").reset();
        }
    } catch (err) {
        alert("Error: " + err.message);
    } finally {
        hideLoadingSpinner(loader);
    }
}

function simulateAPICall(userData) {
    return new Promise((resolve) => {
        setTimeout(() => resolve({ success: true, data: userData }), 1500);
    });
}

function showLoadingSpinner() {
    const spinner = document.createElement("div");
    spinner.innerHTML = `<div class="spinner-border text-primary position-fixed top-50 start-50" style="z-index:9999;"></div>`;
    document.body.appendChild(spinner);
    return spinner;
}

function hideLoadingSpinner(spinner) {
    if (spinner) spinner.remove();
}

/*Utility + Debug + DOM Ready*/
function registerUser(eventName, userName) {
    const event = communityEvents.find(e => e.name === eventName);
    if (event && event.register()) {
        if (event.category === "workshop") workshopTracker.addRegistration();
        if (event.category === "seminar") seminarTracker.addRegistration();
        return true;
    }
    return false;
}

document.addEventListener("DOMContentLoaded", function () {
    displayEvents();
    console.log("Sample Events Loaded:", communityEvents.map(e => e.name));
});
