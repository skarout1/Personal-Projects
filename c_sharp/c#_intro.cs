using System;

namespace C_Program
{
    class FirstProgram
    {
        static void Main(String[] args)
        {
            //This is the same as System.out.println(); in Java
            Console.WriteLine("First Program");

            //Decleration of some variables
            
            //integer variables
            //1 byte
            byte smallNumer = 225; //only from 0 - 255 
            //8 bytes
            int regularNumber = 0; //from 2,147,483,647
            //8 bytes
            long largeNumber = 0;

            //floating point type variables. better for fractions
            //4 bytes
            float floating = 0f; //6 - 7 digits
            //8 bytes
            double dbl = 0; //15 decimal digits
            //16 bytes
            decimal decimals = 0m; //28-29 digits

            //the var data type can tell the comiler to infer the following variable type
            var inferedInt = 10; //infered an int
            var a = array[] {0,1,2,3,4}; //infered an arrayList

            //? + null can allow a varibale to not have any value
            string? nullString = null;
            int? nullInt = null;

        }
    }
}