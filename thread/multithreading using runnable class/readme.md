<p>Thread Class vs Runnable Interface 
<br>
1.)If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
<br>2.)We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
<br>3.)Using runnable will give you an object that can be shared amongst multiple threads. </p>
