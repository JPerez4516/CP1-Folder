import get-pip.py
from flask import Flask
app = Flask(stemProject)

@app.route('/')
def hello_world():
    return 'Hello, World!'