Attacks against confidentiality
- eaves dropping
- sniffing
- snooping
- wiretapping
- phishing
- social engineering
- traffic analyss
attacks against integrity
- modification
- masquerading
- replaying
- repudiation
- session hijacking
- man in the middle attacks
- data diddling attacks
attacks against availability
- dos
- ddos
- syn attack slowloris
- physical attacks on server infra


### CRYPTOGRAPHY


pair of algorithms used for encryption and description are called ciphers

- symmetric key cryptography
	- cipher
		- stream cipher
			- encryption is done one char at a time
		- block cipher
			- done in one block of character at a time 
		- traditional cipher
			- substitution cipher
				- mono alphabetic
					- caesar cipher
				- poly alphabetic
					- autokey cipher
			- transposition cipherr
				- changes the position instead of substituting
		- modern cipher
			- bit oriented
			- block or stream
			- ##### DES
				- takes 64 bit plaintext -> 64 bit cipher same 56 bit key is used
				- 16 rounds
				- des function
				- key generator
				- its a block cipher
			- modern stream cipher
				- one time pad
				- 
- assymmetric key cryptography
	- RSA
		- two exponents
		- e-> public and d-> private 
		- P -> plain text C-> ciphertext
		- C= P<sup>e</sup>mod n
		- P=C<sup>d</sup>mod n
		- modulus n is a very large number
		- x choses 2 numbers p and q
		- n= p x q
		- phi =(q-1)(p-1)
		- (e x d) mod phi=1

### MESSAGE INTEGRITY

- Message and message digest
	- essentially hash

### MESSAGE AUTHENTICATION
message authentication codes