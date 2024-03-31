### ANDROID RESOURCES
- animator
- anim
- color
- drawable
- mipmap
- layout
- menu
- raw
- values
- xml


### CONTENT PROVIDERS
central repository access to data mainly intended for use by other applications we can use crud operations based on ContentResolver class main way we implement is using a cursorloader to run an asynchronous query in the background 

### ANDROID BUILT IN CONTENT PROVIDERS
- call log
- contact
- browser
- media
- user dictionary
- settings

### INTENTS
Intents are the primary message passing mechanism of android we can pass a message to start another activity service or broadcast receiver we make the components all wired together with this one and we can pass message to different parts of our app we can start activity etc
- explicit intent  internal use(inside their app itself)
- implicit intent external use(used to activate a component outside of their application)
intent filters- declared in manifest to declare which intent we can respond to
broadcasting we can also use intent to broadcast data

- starting activity
- starting service
- starting broadcast receiver

- pending intent perform intent on behalf of another application as if the application component was our own 
- 
