# Mocking
now that we've done an amazing junit testing.
we will try and ensure the controller works as we expect.
###
There are two testmethods that should be filled out where we validate the input
to the method is handled correctly such that a paintbrush with color and size works
and one will no values fails.

###
Because we dont want to have a statefull test that depends on the actual service
implementation and its underlying datastore. We mock this to reduce  the test 
of only checking input parameters.



So The task is mock IColorService and fill out the body of the two test methods.

