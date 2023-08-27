//Press Alt + 1 to ensure full file has loaded

//Press Alt + 2 to collapse forms

'Contact-me':{
'email':{
	'defaultTo': 'dan.odonnell928@gmail.com',
	'subject': 'You have mail!',
	'body': [
	{'type': 'message', 'content': 'Name:'},
	{'type': 'replacement', 'content':'name'},
	{'type': 'message', 'content': 'Email:'},
	{'type': 'replacement', 'content':'email'},
	{'type': 'message', 'content': 'Confirm email:'},
	{'type': 'replacement', 'content':'confirmemail'},
	{'type': 'message', 'content': 'Message:'},
	{'type': 'replacement', 'content':'message'},
	],
},
'form': {
	'name': {'label': 'Contact name',},
	'email': {'label': 'Contact email',},
	'confirmemail': {'label': 'Email confirmation',},
	'message': {'label': 'Contact message',},
},
}, // Contact-me	
