# Invoice

A simple API for invoice generation and tracking

## Requirements
1. MongoDB
2. Spring

## Features
1. jwt based auth
2. create and email invoices
3. Track paid/unpaid invoices
4. View charts and graphs

## API

``` 
User
    - (POST) /login: {username, password}`
    - response: {jwt}
    
    - (POST) /signup: {user}
    - response: {user, jwt}
```
    

