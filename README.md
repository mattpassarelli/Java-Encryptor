# Java-Encryptor
A bad way of encrypting your messages

Basically I got bored at work and have been wanting to make my own basic encryptiong for a while. It's simple enough. It takes the time of your system clock in milliseconds and picks a random int from that long. Then converts your inputted string to ASCII values and multiples each new ASCII by the selected number or "key." And ta-da.

Decrpyting is simple as well. Just divide by the key, which is saved somewhere (no idea where yet), then from ASCII back to chars and into a string. 
