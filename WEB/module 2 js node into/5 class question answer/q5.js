//move a file

let fs = require("fs");
let path = require("path");

let srcPath = path.join(__dirname,"module1","file1.txt");
console.log(srcPath);
let destPath = path.join(__dirname,"module2","file1.txt");
console.log(destPath);
fs.copyFileSync(srcPath,destPath);

fs.unlinkSync(srcPath);