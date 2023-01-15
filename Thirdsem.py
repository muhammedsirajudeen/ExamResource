print("hello world")

#an express is something that evaluates to a value
#eval evaluates a string like python expression and returns result ex eval("10**2") returns 100

print("hello","world",sep=",")
#hello,world

#program to get reverse of a number \

#control statements sequential control selection control iterative control

#search and look up the ascii encoding chart

#compound boolean expression a==true and b==false

#short circuit lazy evaluation
a=5
b=10
if a==b and b==a:
    print("here the expression is not false so it wont evaluate second")

if a==5 or b==10:
    print("here it wont be avluated ")

#this is called short  circuit or lazy evaluation

max = a if a>b else b
#well kinda similiar to the c language you got the idea

#iterative control definite and indefinite iteration


#else clause on loops if the loop is exited normally then that would be executed otherwise the else clause would be skipped 
#check an example on this
#build an example on string splitting

#program components in python are called functions classes modules and packages

#type of functions built in function user defined function a function that has no name anonymouse functions

#important parts of predefined functions
#name parameter result type


#we can create a tuple dictionary or set from iterable 
a=[1,2,3]
#a can represent any iterable
b=list(a)
c=tuple(a)
e=set(a)

d=dict(a=0,b=1)


#zip example
a=[1,2,3,4]
b=[5,6,7,8]
x=zip(a,b)
print(list(x))
#here we can create list or tuple

#arguments vs parameter 
#keyword argument default argument positional argument

#date time module for date and time 
#there is naive and aware datetime object in python aware have daylight saving time and details about the time zone and 
# information like that

#python uses mersene twister as the core of random number generation

#user defined function 
#name parameter body
#program for greatest common divisor

# def name(a,b): a and b are callled formal arguments arguments are also called parameters
#name(a,b) => calling this functions then then values provided are called actual parameters

#required arguments are also called positional arguments

#arbitrary arguments can be used to if the programmer cant predict in advance the number of arguments thats going to be used
#num(*a)

# namespaces store information about a identifier

#the namespace will contain a value called __name__ that contains the modules name whenever python start executing
#the modules name is __main__


#lambda function
name=lambda Name : print(Name)
name("sirajudeen")

#filter returns a list where the values matches the condition
#map is used to perform a function on every value on the list

#dlt can be used to delete the entire string object 

#a set cannot have mutable elements
#python considers empty curly braces as dictionary so the only way to define an empty set is with the set function set()

#difference between remove and discard remove raises exception while discard doesnt
#pop will delete randomly in sets 

#learn about bytearrays and memory view

#set intersection and union

a={1,2,3,4}
b={1,2,3,4,5}
print(a | b)
# | operator is used for union
#otherwise we can use
print(a.union(b))

#intersection id donw with &
print(a & b)
print(a.intersection(b))

#set difference
print(a-b)
print(a.difference(b))

#set symmetric difference only removes the ones that are common uses the ^ operator
print(a^b)
print(a.symmetric_difference(b))


#the difference between the find method and the index method is that 
#find method doesnt raise an exception while index() method does
