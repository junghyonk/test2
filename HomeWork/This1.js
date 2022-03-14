console.log(this === window);

a=30;
console.log(window.a);

function x(){
    return this;
}

x()===window;