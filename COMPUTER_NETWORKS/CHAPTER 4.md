### SERVICES OF TRANSPORT LAYER
- Process to process communication
	- ephemeral port number a port opened by the client when making connections to the server
- Encapsulation and decapsulation
	- in simple words adding header and removing header
- multiplexer demultiplexer
	- whenever an item has more than one source to recieve it is called multiplexing many to one
	- if it has more than one source to send it is called demultiplexing 
	- one to many

### OPEN LOOP CONGESTION CONTROL
tries to avoid it before it happens
- retransmission
- window policy
- ack policy
- discarding policy
- admission policy

### CLOSED LOOP CONGESTION CONTROL
tries to avoid it after it has happened
- backpressure
- chock packet
	- directly to the router to notify congestion
- implicit signalling
	- there is no signalling the source makes the assumption upon lack of acknowledgement
- explicit signalling
	- duh


### QUALITY OF SERVICE
- scheduling
	- fifo queuing 
		- FIFO (First-In, First-Out) queuing in Quality of Service (QoS) refers to a simple queuing mechanism used to manage and prioritize network traffic based on the order of arrival. Here's an explanation of FIFO queuing in QoS:
	- priority queuing
		-  Priority queuing is a queuing method used in networking to prioritize certain types of traffic over others. Imagine you're waiting in line at a supermarket. In a priority queuing system, customers with special needs, like those in a hurry or with only a few items, are served before others. Similarly, in networking, priority queuing ensures that critical data, such as voice or video packets, gets sent ahead of less time-sensitive data, like email or file transfers. It's like giving VIP treatment to important data to ensure it reaches its destination quickly and without delay, even if there's other traffic waiting to be sent.
	- weighted fair queuing 
		- This approach allows for fair distribution of network resources while also accommodating traffic with different priority levels. For example, real-time applications like VoIP or video streaming, which require low latency and consistent bandwidth, can be assigned higher weights to ensure their traffic is handled with priority, while other traffic like file downloads or emails can be given lower weights to avoid hogging bandwidth. Overall, WFQ helps optimize network performance by balancing traffic loads and meeting the diverse needs of different applications.


### TRAFFIC SHAPING AND POLICING
controlling the amount of traffic is called traffic shaping
- leaky bucket
	- using analogy of a leaky bucket
- token bucket
	- deeper but u did understand
	- for each clock tick a token is assigned if the data is send token is reduced if its idle for too long then the token gets on increasing and if there is a burst of data then as there is enough token it will go out faster


### TRANSPORT LAYER PROTOCOLS
- UDP
- TCP
- SCTP - stream controlled transmission control protocol



### UDP 
connectionless blah blah blah
udp sends data using user datagrams

<table>
	<tr>
			<th style="border-style:solid" >source port number</th>
			<th style="border-style:solid" >destination port number</th>
			<th style="border-style:solid" >length</th>
			<th style="border-style:solid" >checksum</th>
			

</tr>
</table>




### TCP Transmission Control Protocol

tcp blah blah and tcp sends and recieves data in the form of segments 
<table>
	<tr>
			<th style="border-style:solid" >source port number</th>
			<th style="border-style:solid" >destination port number</th>
			<th style="border-style:solid" >sequence number</th>
			<th style="border-style:solid" >acknowledgement number</th>
			<th style="border-style:solid" >header length</th>

			

</tr>
<tr>
			<th style="border-style:solid" >control</th>
			<th style="border-style:solid" >window size</th>
			<th style="border-style:solid" >checksum</th>
			<th style="border-style:solid" >urgent pointer</th>
			<th style="border-style:solid" >options</th>
</tr>
</table>



<u> three way handshakes</u>



### SCTP STREAM CONTROLLED TRANSMISSION CONTROL PROTOCOL
- a blend of both udp and tcp


<table>
	<tr>
			<th style="border-style:solid" >general header</th>
			<th style="border-style:solid" >chunks</th>

			

</tr>
</table>


<u> four way handshake</u>

### APPLICATION LAYER



### FQDN 
fully qualifiable domain name


### EMAIL
 mail transfer agents
smtp simple mail transfer protocol
pop post office protocol
imap internet mail access protocol



### SNMP - SIMPLE NETWORK MANAGEMENT PROTOCOL
- snmp manager
- managed devices
- snmp agent
- management information base


