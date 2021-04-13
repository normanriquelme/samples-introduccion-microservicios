import json
from flask import Flask,jsonify
app = Flask(__name__)


@app.route('/customers')
def customers():
	return jsonify([
		{'id': 1,'name': 'Cliente 1'}
		,{'id': 2,'name': 'Cliente 2'}
		])
