from elasticsearch import helpers, Elasticsearch
import csv

es = Elasticsearch()

with open('CurrencyDumps/eth.csv') as f:
    reader = csv.DictReader(f)
    helpers.bulk(es, reader, index='eth', doc_type='crypto')