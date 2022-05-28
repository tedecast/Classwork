function parseScores(scoresString) {
   // TODO: Compete the function
   let myArray = scoresString.split(" ");
   return myArray;
}

function buildDistributionArray(scoresArray) {
   // TODO: Compete the function, 
   // return array (A,B,C,D,F)
   let disArray = [0, 0, 0, 0, 0];
   for (let score in scoresArray){
      if (score >= 90){
         disArray[0] ++;

      } else if (score >= 80 && score <= 89) {
         disArray[1] ++;

      } else if (score >= 70 && score <= 79) {
         disArray[2] ++;

      } else if (score >= 60 && score <= 69) {
         disArray[3] ++;
      
      } else {
         disArray[4]++;
      }
   }
   return disArray;

}

function setTableContent(userInput) {
   // TODO: Compete the function
   let id = "distributionTable";
   
}

// The argument can be changed for testing purposes
setTableContent("45 78 98 83 86 99 90 59");