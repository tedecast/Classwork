const notablePeople = {
    "Elvis Presley":         new Date(1935, 0, 8),
    "Sonya Sotomayor":       new Date(1954, 5, 25), 
    "Franklin D. Roosevelt": new Date(1882, 0, 30),
    "Elon Musk":             new Date(1971, 5, 28),
    "Roger Staubach":        new Date(1942, 1, 5), 
    "Steve Jobs":            new Date(1955, 1, 24),    
    "Albert Einstein":       new Date(1879, 2, 14),  
    "Isaac Asimov":          new Date(1919, 9, 4),
    "Jada Pinkett Smith":    new Date(1971, 8, 18),
    "Grace Hopper":          new Date(1906, 11, 9)
 };
 
 // Display all names and birthdays
 for (let person in notablePeople) {
    let year = notablePeople[person].getFullYear();
    let month = notablePeople[person].getMonth();
    let day = notablePeople[person].getDate();
    console.log(person + ` ${year}/${month}/${day}`)
 }
 
 // Utility function to compute the rounded number of days difference from a 
 // time difference in milliseconds
 function getDifferenceInDays(timeDifferenceMilliseconds) {
    timeDifferenceMilliseconds = Math.abs(timeDifferenceMilliseconds);
    let daysDifference = timeDifferenceMilliseconds / (1000 * 60 * 60 * 24);
    
    // Return the difference rounded to the nearest whole day
    return Math.round(daysDifference);
 }
 
 // Blank line before next section
 console.log("");
 
 // Your solution here