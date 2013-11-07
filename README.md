lift-conditional-comments
===============

Example to showcase Unparsed not working with html tag.

There are two branches:

1. body - wraps opening body tag
2. html - wraps opening html tag

Both are using code.snippet.Commons.scala to wrap conditional comments for Internet Explorer around the opening html or body tags.

Wrapping around opening body works as expected while trying to wrap around html results in an empty page.

How to reproduce:
=================

1. Checkout 'body' or 'html' branch. 
2. Run 'sbt' and then 'container:start'
3. access [http://localhost:8080](http://localhost:8080)
4. inspect respective tag in html source

Expected result:
================

In each branch the respective tag should be surrounded with conditional comments.

Actual result:
==============

It works as expected for the 'body' tag while the 'html' branch produces an empty page without conditional comments around the opening 'html' tag.
