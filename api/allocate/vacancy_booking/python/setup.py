# coding: utf-8

"""
    Vacancy Booking API and Events

         ## Duty Booking API and events and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "api-server"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Vacancy Booking API and Events",
    author="API support",
    author_email="support@allocatesoftware.com",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "Vacancy Booking API and Events"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description="""\
         ## Duty Booking API and events and Events   # noqa: E501
    """
)
