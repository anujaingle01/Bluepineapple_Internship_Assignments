// Five Function is Declared & Call that function by function name as Input JS

      
            function fun1()
            { 
                console.log("function 1 call");
            }
            function fun2() 
            {
                console.log("function 2 call");
            }
            function fun3() 
            {
                console.log("function 3 call");
            }
            var fun4 = () => 
            {
                console.log("function 4 call");
            }
            var fun5 =function ()
             {
                console.log("function 5 call");
            }
            
            let getName = prompt("Enter function name");
            window[getName]()
           
