### DATA LINK LAYER
- acked connectionless service
- unacked connectionless service
- acked connection oriented service

- LOGICAL LINK CONTROL
- MEDIA ACCESS CONTROL



### DATA LINK CONTROL
reliable transmission data
- line discipiline
	- we dont know if recipient is ready to recieve or if sender is blocked blah blah
	- enq/ack
		- you already know
	- poll/select
		- poll to see if secondary has data to transmit
		- select to see if secondary is ready to recieve data
- flow control
	- stop and wait flow control
	- sliding window flow control
- error control
	- lost frame
	- damaged frame
	- ack
	- nack
	- error detection and correction
		- single bit error
		- burst error
		- error detecting codes
			- block coding 
			- code rate amount of additional bandwidth required to carry the data at the same rate as without the code 
		- error correcting codes
			- Hamming distance means the distance between the error correcting codes means 101 and 011 here hamming distance is 2 as first and second bit differ and third bit is the same 
	- re-transmission and timeout
	- ARQ automatic repeat request
	- stop and wait ARQ
	- go back n ARQ
	- selective reject ARQ
	- 
- framing
	- checksum
	- fixed sized framing
	- variable sized framing
		- byte count
		- flag bytes with byte stuffing
		- flag bytes with bit stuffing
		- physical layer coding violations
			- In Ethernet networks, data is transmitted using a specific physical layer encoding scheme, such as Manchester encoding or Differential Manchester encoding
			- damn that was genius honestly




### ERROR DETECTION CODES
- Vertical redundancy checks VRC or parity
	- used to check errors in every single character
- longitudinal redundancy checks LRC
	- used to check errors in block of bits also called message parity
- Cyciclical redundancy check CRC
	- learn more about kinda know about calculation but have to learn deeper
	- sender and reciever agree upon a generator polynomial -> L
	- we add L-1 bits to the original message
	- perform binary division
	- remainder of the division is the crc must be L-1 bits
	- XOR
- checksum
	- in desired block then add blocks for 1s complement then complement the sum and send and in reciever side add all things together and find sum if its zero the packet is valid
### LEARN MORE ABOUT CRC AND CHECKSUM IN DETAIL mainly about crc

### ERROR CORRECTION CODES
- backward error correction
	- asks to resent all data
- forward error correction
	- error is self corrected that means it is automatically corrected
	- Hamming code - have idea about what it is learn more about it afterwards after finishing everything



### MAC
network link can be classified to two
- point to point
- broadcast

Media Access Control protocols can be divided two
- random access protocols
	- ALOHA 
		- additive links on line hawaii area
		- pure aloha
			- relies on ack
		- slotted aloha
			the sending time is divided  into discrete time slots
	- CSMA 
		- Carrier sense multiple access
		- senses if transmission medium is busy before sending
		- 1- persistent
		- non persistent
		- o persistent
		- p persistent
	- CSMA/CD
		- zero 
		- normal
		- abnormal
	- CSMA/CA
		- avoids sending
		- interframe space ifs
		- contention window
		- acknowledgement
- controlled access protocols
	- POLLING
	- TOKEN PASSING
	- RESERVATION



### IEEE STANDARDS
International institute of electronics and electrical engineers

### IEEE 802.3 ETHERNET
- thicknet
- thin net
- twisted pair ethernet
- fibre ethernet
### IEEE 802.11 WLAN

### IEEE 802.15.1 Bluetooth

### IEEE 802.16 WIMAX
- world wide interoperability for microwave access
- WiMAX is a wireless communication technology that provides high-speed internet access over long distances. It operates similarly to Wi-Fi but offers greater range and bandwidth, making it suitable for providing internet access in areas where wired infrastructure is impractical or unavailable. WiMAX works by using radio waves to transmit data between a base station and user devices, such as laptops, smartphones, or fixed terminals. It can deliver internet access speeds comparable to DSL or cable modem connections, allowing users to access the internet, stream multimedia content, and engage in online activities. WiMAX has been deployed in both urban and rural areas to bridge the digital divide and expand broadband access to underserved communities. It offers flexibility, scalability, and cost-effectiveness, making it a viable solution for broadband connectivity in various environments.


### MOBILE NETWORKS
- radio base stataion -> mobile switching center -> public switched telephone network
- GSM global system for mobile communications
- GPRS general packet radio service 

### EVOLUTION
- 1g
- 2g
- 3g
- 4g
- 5g

