# string methods
def Stringmethods():
    txt="hello"
    txt.capitalize()
    #first character will be changed to uppercase

    txt.casefold()
    #returns the full string in lowercase letter
    txt.center()
    # centers the string
    txt.count("h")
    #returns the specified number of letter found in hello
    txt.encode()
    #this will encode the string
    txt.endswith() #check if the string ends with the specified letter
    txt.expandtabs() #sets the tabsize to provided value
    txt.find() #finds the first occurence in the string 
    txt.format() #refer text book page number 280
    txt.index() #find the index of the first occurence

txt="hey"
print(txt.split())
