lift-conditional-comments
===============

Example to showcase Unparsed not working with <html> tag.

There are two branches:

1. body - wraps opening <body> tag
2. html - wraps opening <html> tag

Both are using code.snippet.Commons.scala to wrap conditional comments for Internet Explorer around the opening <html> or <body> tags.

Wrapping around opening <body> works as expected while trying to wrap around <html> results in an empty page.
