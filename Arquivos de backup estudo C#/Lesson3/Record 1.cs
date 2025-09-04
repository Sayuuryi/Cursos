using System;

namespace Application
{
    class Program
    {
        public record Point(int X, int Y);
        public static void Main()
        {
            Point pt = new Point(1, 1);
            var pt2 = pt with { Y = 10 };
            Console.WriteLine($"The two points are {pt} and {pt2}");
        }
    }
}