
		DRAFT -- The DC Kernel Application Profile -- DRAFT
				30 August 2006

This document defines the DC Kernel Application Profile (KAP), specifying
its elements and requirements.  The DC KAP is designed for providers
that need to support the orderly management of their information objects,
and wish to do so with minimal overhead in reading and processing metadata
descriptions.

The document begins by listing kernel metadata requirements in more detail
and correlating them with specific characteristics as found in the kernel
metadata specification [KSpec].  It then compares the core DC semantics
and DCMI Abstract Model [AModel] with kernel metadata elements and the
Electronic Resource Citation (ERC) record structure for holding kernel
resource descriptions.

|| Requirements

The overall goal of low-overhead, orderly management includes the needs
to reliably identify problem objects during troubleshooting, and to
query collections to produce ordered object subsets for the purpose of
collection surveying.  Organizations that perform orderly management
should also be able to report externally on their support commitments
and policies.  The KAP frames these needs in the context of the
following more specific requirments.

  + Reduction
 
Beginning with the 15 basic DC elements, the DC Kernel Specification
[KSpec] distills out a smaller subset of elements to produce a concise
description for troubleshooting that can be grasped in a glance.  The
kernel borrows from the journalistic tradition that "boils down" the
essence of a story into the "who, what when, where" of an expression of
an information resource.

  + Economy of Expression

To minimize the visual bandwidth in that glance, a simple eye- and
machine-readable ERC format is specified that has both a normal and
extra concise format (allowing suppression of labels by relying on
positional elements).  Multi-valued dates and ranges are also allowed
so as to avoid having to rely on additional date elements, especially
those indicating starts and ends of open-ended ranges.

  + Predictability

To meet the need for determinism during troubleshooting, the above four
elements are required.  Some flexibility in that requirement is permitted
if the value for the given label is one of nine well-known values for
"empty" (:unkn, :unav, :unac, :unap, :unas, :none, :null, :unal, and :tba).

  + Sort-Friendliness

To be useful in orderly management, it should be possible for specific
element metadata to be entered in such a way that adjacent records in a
collection survey can be meaningfully ordered by simple lexical sort on
that element.  The "sort-friendly" feature should be optional so that
providers can opt out of making such assertions about their metadata.

  + Economy of Interpretation

To minimize burden of metadata interpretation by collection manager
scripts, the ERC format is based on email headers [ANVL] and may be
parsed in two lines of Perl (eg, without a DOM parser as required for XML).

|| Mapping from Kernel to Dublin Core Elements

Kernel elements are mapped to the 15 Dublin Core elements according to
the "story" type.

 erc:  the story of the expression of a resource
    who		from DC Creator, Contributor, or Publisher
    what	from DC Title
    when	from DC Date
    where	from DC Identifier

 erc-about:  the story of a resource's content
    who		(not mapped from DC)
    what	from DC Subject
    when	from DC Coverage (temporal)
    where	from DC Coverage (spatial)

 erc-from:  the story of the origin of the metadata record itself
    who		(not mapped from DC)
    what	(not mapped from DC)
    when	(not mapped from DC)
    where	(not mapped from DC)

 erc-support:  the story of a support commitment made to an object
    who		(not mapped from DC)
    what	(not mapped from DC)
    when	(not mapped from DC)
    where	(not mapped from DC)


|| The Abstract Model and DC Kernel Metadata Resource Descriptions

The following aspects of the DCMI abstract model are supported by the KAP:

    + properties
    + property URIs (base URL plus element name)
    + value strings
    + description sets

The KAP does not support the following aspects of the DCMI abstract model:

    + value string languages
    + encoding schemes
    + encoding scheme URIs
    + resource classes
    + rich representations
    + related descriptions
    + property/sub-property relationships

URIs are not explicitly supported in the KAP, but may be implicit for:

    + value URIs
    + resource URIs
    + resource class URIs

Each property may be repeated.


|| References

[Spec] http://www.jiscmail.ac.uk/files/DC-KERNEL/Aspec.html

[Model] http://www.dublincore.org/documents/abstract-model/

[ANVL] http://www.cdlib.org/inside/diglib/ark/anvlspec.pdf
