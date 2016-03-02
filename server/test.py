#!/usr/bin/env python3
##
## venv is a python virtualenv
##
## THE HELL INSTALL VIRTUALENV BEFORE SCREWING ANYTHING UP !
##
## (install flask in the venv)
##

from flask import Flask, url_for

app = Flask(__name__)

app.debug = True

@app.route('/')
def index(): pass

@app.route('/hello')
def hello_world ():
    return "Hello, world!"

with app.test_request_context():
    print url_for('index')

if __name__ == '__main__':
    app.run()
