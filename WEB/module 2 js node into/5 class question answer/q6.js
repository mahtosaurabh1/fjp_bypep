//read content of unorganised folder and print each file type
//for example abc.mp3 --> print Audio File
//            xyz.mp4 --> print Video File
//            fsd.jpeg -> print Image File
let fs=require("fs")
let path=require("path")

let folderpath=path.join(__dirname,"folderq6")
let content=fs.readdirSync(folderpath)
// console.log(content)
for(let i=0;i<content.length;i++){
    let name=content[i];
    // console.log(path.extname(name))
    let extname=path.extname(name);
    if(extname==".mp3"){
        console.log("audio");
    }else if(extname==".mp4"){
        console.log("video");
    }else if(extname==".jpg"){
        console.log("image");
    }
}