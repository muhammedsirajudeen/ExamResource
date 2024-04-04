### NETWORK LAYER
- logical addressing
- packetizing
- routing
- forwarding
	- forwarding between networks -> like that of the router
- implementing connectionless and connection oriented services
- congestion control

### NETWORK DEVICES
- repeater
- bridges
	- simple bridging
	- multiport bridging
	- transparent bridging
- router
- gateway it can operate on multiple protocols and all seven layers of osi

### LOGICAL ADDRESSING
- ipv4 32 bit
	- classless interdomain routing or CIDR block
- ipv6 128 bit
	- unicast
	- anycast
	- multicast

### NETWORK ADDRESS TRANSLATION RFC 1631
- static nat
	- Static NAT, also known as one-to-one NAT, involves the mapping of a single private IP address to a single public IP address.
- dynamic nat
	- Dynamic NAT allows multiple private IP addresses to be dynamically mapped to a pool of public IP addresses from a designated range.
- overloading nat 
	- Overloading NAT, also known as Port Address Translation (PAT) or NAT overload, enables multiple private IP addresses to share a single public IP address by using different port numbers to distinguish between connections.
- overlapping nat
	- handles collision issues

### INTERNET PROTOCOLS
- ip
- arp
- icmp
- igmp


##### LEARN MORE ABOUT IPV4 PACKETS AND IPV6 PACKETS AT LAST

- dual stack
- tunnelling
- address translation



### ADDRESS MAPPING
- static mapping
	- keeps a table in place to allow for lookups and all tables must have these tables inorder to communicate effectively
- dynamic mapping
	- uses some sort of protocols to get the corresponding mapping 
### ICMP
- error reporting messages
	- destionation unreachable
	- source quench
	- time exceeded
	- parameter problem
	- redirection message
- query messages
	- echo request and reply
	- timestamp request and reply
	- address mask request and reply
	- router solicitation and router advertisement


### DELIVERY
- direct
- indirect

techniques to make routing table manageble
- next hop routing
- network specific routing
- default method


### ROUTING ALGORITHMS
- static routing
	- 
- dynamic routing


routing schemes in how they deliver messages
- unicast
- broadcast
- multicast
- anycast
- geocast


### UNICAST ROUTING ALGORITHM
- distance vector routing
	- RIP routing information protocol 
- link state routing
	- open shortest path first


