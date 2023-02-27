// Shuffle Problem in JS.

let grid = [[0,0],[0,0]];

//R=1, G=2, B=3
let colour = [1,2,3]

grid[0][0] = 1;
grid[0][1] = 2;
grid[1][0] = 3;

for(let i=0; i<2; i++) 
{
    console.log(grid[i]);
}

for(let i=0; i<3; i++)
 {
    if(grid[0][0]===colour[i]) 
    {
        
        grid[0][0] = colour[i+1];
        grid[0][1] = colour[i];
        grid[1][0] = colour[i+2];
        grid[1][1] = 0;
    }
    for(let j=0; j<2; j++)
     {
        console.log(grid[j]);
    }    
}